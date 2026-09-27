//This is the class identifier/declaration. Declares the class
public class ExplanationVariables
{
    //This is the method header
    public static void main(String[] args)
    {
        //Explain a few different cases

        System.out.println(4+5+"Hello World!");
        //since the math is before the String, this will output 9Hello World!
        System.out.println("Hello World"+4+5);
        //This will output Hello World45 since the + is concatenation, not actual addition now.
        System.out.print("Hello "+4+5+"World!"+(4+5));
        //this will output Hello 45World!9, since the parentheses force addition, not concatenation.
    }
}