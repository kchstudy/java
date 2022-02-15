# java study

## 기본 자료형(PrimitiveTypes)

```
숫자형(정수)
int  | -2,147,483,648 ~ +2,147,483,647                         | int i = 0;
long | -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 | long l = 123l;

숫자형(소수점)
float  | -3.4E38 ~ +3.4E38   | float f = 0.123f;
double | -1.7E308 ~ +1.7E308 | double d = 0.128379123d;
```

```
문자형(글자단하혀나)
char c1 = 'C'; // ''으로 써야함
char c2 = '\u0000'; // unicode 사용 가능

문자형(글자여러개)
String str = "글자가 여러개 wow"; // ""으로 써야함
```

```
논리형(참/거짓)
boolean bt = true;
boolean bf = false;
```

## 반복문(loop)

### for

#### 기본 for 문

```

for ( int i = 0 ; i < 5 ; i++ ) {
    System.out.println( "반복돼요!" );
}

// for ( int i = 0 ; i < 5 ; i++ ) 
// i 는 0 으로 시작해서 ; i 가 5보다 작을때까지 ; i는 1씩 증가할거예요
// 0 부터 4 까지 총 5번 반복

// for ( int i = 5 ; i > 0 ; i-- ) 
// i 는 5 로 시작해서 ; i 가 0보다 클때까지 ; i는 1씩 감소할거예요
// 5 부터 1까지 총 5번 반복
```

## 연산자(Operator)

* for 문 ()안 마지막에 있는 i++, i-- 가 무엇인지 알 수 있다.

### 산술 연산자(arithmetic operator)

```
+ : 더하기
- : 빼기
* : 곱하기
/ : 나누기
% : 나누기 후 나머지
```

### 대입 연산자(assignment operator)
```
=  : 왼쪽에 오른쪽을 대입함. a = 10; a 는 10
+= : 왼쪽에 오른쪽을 더한 후, 그 결괏값을 왼쪽에 대입함. a += 10; => a = a + 10;
-= : 왼쪽에 오른쪽을 뺀 후, 그 결괏값을 왼쪽에 대입함. a -= 10; => a = a - 10;
*= : 왼쪽에 오른쪽을 곱한 후, 그 결괏값을 왼쪽에 대입함. a *= 10; a = a * 10;
/= : 왼쪽을 오른쪽으로 나눈 후, 그 결괏값을 왼쪽에 대입함. a /= 10; a = a / 10;
%= : 왼쪽을 오른쪽으로 나눈 후, 그 나머지를 왼쪽에 대입함. a %= 10; a = a % 10;
// 더 많이 있지만 거의 쓰질 않아서 설명 생략
```

### 증감 연산자(increment and decrement operators)
```
1씩 증가나 감소를 하는 연산자
++ : 증가
-- : 감소

++i : 선증가 
--i : 선감소
i++ : 후증가
i-- : 후감소
// 직접 코드를 실행하며 결과를 확인하세요
```

### 비교 연산자(comparison operator)
```
// 왼쪽과 오른쪽을 비교하며 결과는 true나 false를 반환한다
<  : 왼쪽이 오른쪽보다 작으면 true, 아니면 false
<= : 왼쪽이 오른쪽보다 작거나 같으면 true, 아니면 false
>  : 왼쪽이 오른쪽보다 크면 true, 아니면 false
>= : 왼쪽이 오른쪽보다 크거나 같으면 true, 아니면 false
== : 왼쪽과 오른쪽이 같으면 true, 아니면 false
!= : 왼쪽과 오른쪽이 같지 않으면 true, 아니면 false
```

### 논리 연산자(logical operator)
```
&  : (and 그리고) 앞 뒤 조건 모두 true 이면 true, 아니면 false : 앞 조건이 false 인 경우 뒤 조건을 실행하고 false 반환
&& : (and 그리고) 앞 뒤 조건 모두 true 이면 true, 아니면 false : 앞 조건이 false 인 경우 뒤 조건을 실행하지 않고 false 반환
|  : (or 또는) 앞 뒤 조건 모두 둘 중 하나만 true 이면 아니면 false : 앞 조건이 true 인 경우 뒤 조건을 실행하고 true 반환
|| : (or 또는) 앞 뒤 조건 모두 둘 중 하나만 true 이면 아니면 false : 앞 조건이 true 인 경우 뒤 조건을 실행하지 않고 true 반환
```

### 비트 연산자(bitwise operator)
```
```

### 삼항 연산자(ternary operator)
```
```

### instanceof 연산자
```
```
