package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_1043 {

    public static ArrayList<Integer>[] party;
    public static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        int[] truth = new int[k];

        for (int i = 0; i < k; i++) {
            truth[i] = Integer.parseInt(st.nextToken());
        }

        parent = new int[N + 1];
        party = new ArrayList[M];
        for (int i = 0; i < M; i++) {
            party[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int peoples = Integer.parseInt(st.nextToken());

            for (int j = 0; j < peoples; j++) {
                party[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M;  i++) {
            int man = party[i].get(0);
            for (int j = 1; j < party[i].size(); j++) {
                union(man, party[i].get(j));
            }
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int leader = party[i].get(0);
            boolean flag = true;
            for (int j = 0; j < k; j++) {
                if (isItSame(leader, truth[j])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }

    public static int find(int a) {
        if (parent[a] == a) {
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }

    public static boolean isItSame(int a, int b) {
        return find(a) == find(b);
    }
}
