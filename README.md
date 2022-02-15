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

