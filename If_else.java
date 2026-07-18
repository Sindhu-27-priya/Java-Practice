public class If_else{
    public static void main(String[] args){
        int salary=38490;
        if(salary > 15000){
            salary+=2000;
        }else{
            salary+=1000;
        }
        System.out.println("Salary:"+salary);
        int age=20;
        if(age > 18){
            age+=1;
        }else if(age == 18){
            age+=2;
        }else{
            age+=0;
        }
        System.out.println("Age:"+age);
    }

}