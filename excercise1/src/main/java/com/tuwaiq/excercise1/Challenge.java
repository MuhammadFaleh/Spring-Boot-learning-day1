package com.tuwaiq.excercise1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Challenge {
    private int[] numbers = {1,2,3,4,5,6,7,8,9};
    private ArrayList<Integer> numbersUser = new ArrayList<>();

    @GetMapping("GET/1")
    public String addNumber1(){
        numbersUser.add(numbers[0]);
        return "1 was added";
    }

    @GetMapping("GET/2")
    public String addNumber2(){
        numbersUser.add(numbers[1]);
        return "2 was added";
    }

    @GetMapping("GET/3")
    public String addNumber3(){
        numbersUser.add(numbers[2]);
        return "3 was added";
    }

    @GetMapping("GET/4")
    public String addNumber4(){
        numbersUser.add(numbers[3]);
        return "4 was added";
    }

    @GetMapping("GET/5")
    public String addNumber5(){
        numbersUser.add(numbers[4]);
        return "5 was added";
    }
    @GetMapping("GET/6")
    public String addNumber6(){
        numbersUser.add(numbers[5]);
        return "6 was added";
    }
    @GetMapping("GET/7")
    public String addNumber7(){
        numbersUser.add(numbers[6]);
        return "7 was added";
    }
    @GetMapping("GET/8")
    public String addNumber8(){
        numbersUser.add(numbers[7]);
        return "8 was added";
    }

    @GetMapping("GET/9")
    public String addNumber9(){
        numbersUser.add(numbers[8]);
        return "9 was added";
    }
    @GetMapping("GET/sum")
    public String sumNumber(){
        int num = 0;
        for (int number : numbersUser){
            num +=number;
        }
        if(numbersUser.size() > 0){
            return String.format("the result of the sum is %d", num);
        }else return "enter numbers";
    }
    @GetMapping("GET/multi")
    public String multiNumber(){
        int num = 1;
        for (int number : numbersUser){
            num *=number;
        }
        if(numbersUser.size() > 0){
            return String.format("the result of the multi is %d", num);
        }else return "enter numbers";
    }
    @GetMapping("GET/sub")
    public String subNumber(){
        int num = numbersUser.get(0);
        for (int number : numbersUser){
            num -=number;
        }
        if(numbersUser.size() > 0){
            return String.format("the result of the sub is %d", num);
        }else return "enter numbers";
    }

    @GetMapping("GET/div")
    public String divNumber(){
        int num = numbersUser.get(0);
        for (int number : numbersUser){
            num /=number;
        }
        if(numbersUser.size() > 0){
            return String.format("the result of the div is %d", num);
        }else return "enter numbers";
    }

    @GetMapping("GET/display")
    public ArrayList<Integer> display(){
        return numbersUser;
    }

    @GetMapping("GET/clear")
    public String clearAll(){
        numbersUser = new ArrayList<>();
        return "cleared";
    }
}
