public class Messages
{
    public static void main (String[] args)
    {
        Thought thinking = new Thought();
        Advice speaking = new Advice();

        thinking.message();

        speaking.message(); // Overridden method

        System.out.println("Vivek Kumar 1/27");
    }
}
