public class Main {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Петр петрович Иванов";
      //  String user2mod = new String();
      //  user2mod = "user 2";
      //  user2mod.replace(" ", "D");
      //  System.out.println(user2mod);
       checkUserName(user1,user2);
    }

    private static void checkUserName(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
        System.out.println(user2.replaceAll(" ", ""));
        //System.out.println(user2mod);
        System.out.println("А без пробелов Ваше имя имеет длину " + user2.replace(" ", "").length() + " символов");

    }
}