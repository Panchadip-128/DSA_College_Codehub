package pan_002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String2 {
private String name;

public String2(String name) {
    this.name = name;
}

public String extractInitials() {
String[] words = name.split("\\s+");
StringBuilder initials = new StringBuilder();

for (String word : words) {
    if (word.length() > 0) {
        initials.append(Character.toUpperCase(word.charAt(0)));
    }
}

        return initials.toString();
    }

public String removeWhitespace() {
        return name.replaceAll("\\s+", "");
    }

public static List<String2> listNamesContainingSubstring(List<String2> students, String substring) {
List<String2> result = new ArrayList<>();

for (String2 student : students) {
    if (student.name.contains(substring)) {
        result.add(student);
    }
}
return result;
    }

public static void sortStudentsAlphabetically(List<String2> students) {
        Collections.sort(students, (s1, s2) -> s1.name.compareToIgnoreCase(s2.name));
    }

public static void main(String[] args) {
List<String2> students = new ArrayList<>();
students.add(new String2("John Doe"));
students.add(new String2("Jane Smith"));
students.add(new String2("Alice Johnson"));
students.add(new String2("Bob Brown"));

for (String2 student : students) {
System.out.println("Initials of " + student.name + ": " + student.extractInitials());
}


for (String2 student : students) {
System.out.println("Name without whitespace: " + student.removeWhitespace());
}


List<String2> filteredStudents = listNamesContainingSubstring(students, "Jo");
System.out.println("Students containing 'Jo':");
for (String2 student : filteredStudents) {
    System.out.println(student.name);
}


sortStudentsAlphabetically(students);
System.out.println("Students sorted alphabetically:");
for (String2 student : students) {
    System.out.println(student.name);
        }
    }
}

