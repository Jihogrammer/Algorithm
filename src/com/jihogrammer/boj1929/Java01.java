package com.jihogrammer.boj1929;

import java.io.*;
import java.util.StringTokenizer;

public class Java01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken()),
            N = Integer.parseInt(st.nextToken());
        
        for (int i=M; i<=N; i++) if (isPrime(i)) sb.append(i).append('\n');

        bw.write(sb.toString()); bw.close();
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false; 
		for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
		return true;
    }
}
