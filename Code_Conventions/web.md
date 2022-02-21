# 코드 규약 명시(Web)

1. 모든 변수는 `직관적인 네이밍`
2. `camelCase` 준수
3. 주석은 함수 혹은 변수, 해당 코드의 `상단에 작성`한다.
4. if / for 문은 아래와 같이 작성한다.

```jsx
if (condtion) {
  state1;
} else {
  state2;
}

if (condtion) {
  state1;
} else if (condtion2) {
  state2;
} else {
  state3;
}

//============================================//
for (initialization; condition; update) {
  states;
}
```

5. 함수의 선언은 `UpperCamelCase` 를 사용하고, 변수의 선언은 `lowerCamelCase`를 사용한다.
6. 변수 선언은 `const, let` 사용 // `var`는 사용 하지 않음
7. 변수의 값이 숫자같은 자료형인 경우 정확히 전처리를 거친후에 값을 변경한다.

```jsx
sum = sum + sub2; // 이와같은 코드는 sub2의 값이 int형 자료라는 보장이 없다.

sum = sum + parseInt(sub2); // <=와 같이 작성한다.
```

8. 비동기 코드의 경우 `asnyc / await` 활용
9. Components 단위의 작성을 통해 코드 재사용성을 높인다.
10. Components exports 의 경우 `export default` 를 기본으로 작성한다.

```jsx
export default function index() {
  return "index Pages";
}
```

11. class Componets 가 아닌 `functional Components`를 사용하여 작성한다.
12. 코드 정렬은 prettier로 하며 아래내용은 `.prettierrc` 내용이다.

```jsx
{
   "printWidth": 80,
   "tabWidth": 2
}
```
