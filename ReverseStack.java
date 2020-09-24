import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = i;
            integerStack.push(i);
        }
        for (Integer element : arr){
            System.out.print(element + ",");
        }
        for (int i = 0; i < 10; i++){
            arr[i] = integerStack.pop();
        }
        for (Integer element : arr){
            System.out.print(element + ",");
        }

        Stack<String> stringStack = new Stack<>();
        String mWork = "Hello";
        String result = "";
        String arrString[] = new String[mWork.length()];

        for (int i = 0; i < mWork.length(); i++){
            stringStack.push(String.valueOf(mWork.charAt(i)));
        }

        for (int i = 0; i < mWork.length(); i++){
            arrString[i] = stringStack.pop();
        }

        for (int i = 0; i < mWork.length(); i++){
            result = result.concat(arrString[i]);
        }
        System.out.println(result);

    }

}
