package pan_002;

public class String1 {
	
private String name;

public String1(String name) {
    this.name = name;
}

    public String formatEmployeeName() {
        String[] words = name.split("\\s+");
        StringBuilder formattedName = new StringBuilder();

for (String word : words) {
    if (word.length() > 0) {
formattedName.append(Character.toUpperCase(word.charAt(0)))
             .append(word.substring(1).toLowerCase())
             .append(" ");
    }
}

        return formattedName.toString().trim();
    }

    public String generateEmail() {
String[] words = name.split("\\s+");
StringBuilder email = new StringBuilder();

if (words.length > 0) {
    email.append(Character.toLowerCase(words[0].charAt(0)));
    if (words.length > 1) {
        email.append(words[1].toLowerCase());
    }
}

email.append("@manipal.edu.com");
return email.toString();
}

    public static void main(String[] args) {
String1 emp = new String1("JOHANNES PETERSON");
System.out.println("Formatted Name: " + emp.formatEmployeeName());
System.out.println("Generated Email: " + emp.generateEmail());
    }
}
