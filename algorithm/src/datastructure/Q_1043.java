package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1043 {

    static int[] parents;
    static List<Integer> party;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parents = new int[n+1];
        for(int i=1; i<n+1; i++) {
            parents[i] = i;
        }
        st = new StringTokenizer(br.readLine());
        int en= Integer.parseInt(st.nextToken());
        party = new ArrayList<>();
        if(en==0) {
            System.out.println(m);
            return;
        }
        else{
            for(int i=0; i<en; i++) {
                party.add(Integer.parseInt(st.nextToken()));
            }
        }

        List<Integer>[] partyList = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            partyList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int pn = Integer.parseInt(st.nextToken());

            int x = Integer.parseInt(st.nextToken());
            partyList[i].add(x);
            for (int j = 1; j < pn; j++) {
                int y = Integer.parseInt(st.nextToken());
                union(x, y);
                partyList[i].add(y);
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int num : partyList[i]) {
                if (party.contains(find(parents[num]))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }

    static int find(int x) {
        if (parents[x] == x) return x;
        return find(parents[x]);
    }


    static void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (party.contains(ry)) {
            int temp = rx;
            rx = ry;
            ry = temp;
        }

        parents[ry] = rx;
    }
}
