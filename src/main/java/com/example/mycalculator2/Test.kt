package com.example.mycalculator2
// fun 동작 main()
fun main() {
   var calc = Calculator() // 붕어빵(객체), 알맹이 (계산기)
// Calculator() 아래 클래스 객체 생성
   var intResult1 = calc.plus(num1 = 2, num2 = 1)
   var intResult2 = calc.minus(num1 = 2, num2 = 1)
   var intResult3 = calc.mul(num1 = 2, num2 = 1)
   var intResult4 = calc.div(num1 = 2, num2 = 1)


   println("정수 덧셈결과: ${intResult1}")
   println("정수 뺄셈결과: ${intResult2}")
   println("정수 곱셈결과: ${intResult3}")
   println("정수 나눗셈결과: ${intResult4}")

// Shift + F6 = (변수 + 함수) 이름변경(자주 쓰는 단축키)
}

class Calculator { // 계산기 붕어빵 틀, 아래 fun(동사개념)은 붕어빵 틀의 특징, 프로퍼티(명사), 메소드이름 동사
// class 선언만 하게된
   fun plus(num1: Int, num2: Int): Int {
      return num1 + num2
   }

   fun minus(num1: Int, num2: Int): Int {
      return num1 - num2

   }
   fun mul(num1: Int, num2: Int): Int {
      return num1 * num2

   }
   fun div(num1: Int, num2: Int):Int {
      return num1 / num2
   }

}

// 함수 하나의 영역 = 중괄호 시작에서 끝까지 == 함수

