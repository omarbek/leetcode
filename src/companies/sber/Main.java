package companies.sber;

public class Main {

    /*

    interface A {
    ...
    void set(Integer arg);
}

interface B {
    ...
    void set(Integer arg);
}

class C implements A,B {
    ?
}

// Так получится? - Да
// Сколько методов в итоговом классе С? - 1

//-------------------------
interface A<T> {
    ...
    void set(T arg);
}

interface B<S> {
    ...
    void set(S arg);
}

class C implements A<Integer>,B<String> {
    ?
}
// Так получится? - Да
// Сколько методов в итоговом классе С? - 2

//-------------------------

// Напиши пример иммутабельного класса
public final class Person{

    private final List<Integer> counts;
    private final int numberOfChildren;

    //getters, not setters
    //for list use copy

}

//----------------------------

class A{
    String name;
    Integer idx;
    //gettess, setters, constructor all args

    public int hashCode(){
        return 31;
    }
}

class B{
    LocalDateTime date;
    Integer idx;
    //gettess, setters
}

var a1 = new A("name", 5);
bar b1 = new B(..);
var map = Map.of(a1, b1, ... , );

.....
a1.setName("new name");

....

var something = map.get(a1);

// Что в переменной something ? - null, потому что у а1 поменялся и там ничего нет
//-------------------------------------------

var list = List.of("abc", "bac", "acd", "dfg", null);
list
.stream()
.map(String::toString)//string stream
.collect(Collectors.groupingBy(q->{
    if(q!=null){
        return Map.of(q.charAt(0), q);
    }
    return Map.of();
    }))
.forEach((key, value) -> System.out.println(key+" "+value));

//Сгруппировать коллекцию по первой букве
//a, abc ac
//Character, String

    */
}
