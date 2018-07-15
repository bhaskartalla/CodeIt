import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestClass {
public static void main(String args[]) throws Exception {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
int N = Integer.parseInt(line);
for (int i = 0; i < N; i++) {
System.out.println(calculateEquation(br.readLine()));
}
}

public static String calculateEquation(String equation) {
equation = equation.replaceAll("PLUS", " + ");
equation = equation.replaceAll("MULTIPLY", " * ");
equation = equation.replaceAll("DIVIDE", " / ");
equation = equation.replaceAll("MINUS", " - ");
List<String> equationList = new ArrayList<String>();
equationList.addAll(Arrays.asList(equation.split(" ")));

processEquation(equationList, "/");
processEquation(equationList, "*");
processEquation(equationList, "+");
processEquation(equationList, "-");
return equationList.get(0);
}

public static void processEquation(List<String> equationList, String operator) {
int currentIndex = 0;
while ((currentIndex = equationList.indexOf(operator)) > -1) {
equationList.set(currentIndex - 1, String.valueOf(calculateValue(equationList, currentIndex, operator)));
equationList.remove(currentIndex);
equationList.remove(currentIndex);
}
}

public static int calculateValue(List<String> equationList, int currentIndex, String operator) {
switch (operator) {
case "/":
return Math.floorDiv(Integer.parseInt(equationList.get(currentIndex - 1)),
Integer.parseInt(equationList.get(currentIndex + 1)));
case "*":
return Math.multiplyExact(Integer.parseInt(equationList.get(currentIndex - 1)),
Integer.parseInt(equationList.get(currentIndex + 1)));
case "+":
return Math.addExact(Integer.parseInt(equationList.get(currentIndex - 1)),
Integer.parseInt(equationList.get(currentIndex + 1)));
case "-":
return Math.subtractExact(Integer.parseInt(equationList.get(currentIndex - 1)),
Integer.parseInt(equationList.get(currentIndex + 1)));
default:
System.out.println("error - currentIndex : " + currentIndex + " operator - " + operator);
return -1;
}
}
}