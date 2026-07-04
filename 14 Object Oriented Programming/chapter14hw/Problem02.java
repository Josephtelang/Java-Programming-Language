public class Problem02 {
    
    
}
class Automobile{
    private String drive() {
        return"Driving vehicle";
    }

}

class Car extends Automobile{
    private String drive(){
        return "Drive car";
    }
}

public class Electric extends Car{
    
}