[MAIN](../../README.md)|<img width=50/>#4948<img width=50/>|[Baekjoon](https://www.acmicpc.net/problem/4948)
-|-|-

# 베르트랑 공준

## Solution

- [Java - 01](Java01.java) : [1929](..\bj01929\Java05.java)에서 변형

###### 참고: [1929-소수 구하기](../bj01929/README.md), [1978-소수 찾기](../bj01978/README.md), [2581-소수 찾기](../bj02581/README.md), [9020-골드바흐의 추측](../bj09020/README.md)

## Problem

베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개(11, 13, 17, 19)가 있다. 또, 14보다 크고, 28보다 작거나 같은 소수는 3개(17,19, 23)가 있다.

n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

## Input

입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)

입력의 마지막에는 0이 주어진다.

## Output

각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.

## Example

#### input

```
1
10
13
100
1000
10000
100000
0
```

#### output

```
1
4
3
21
135
1033
8392
```