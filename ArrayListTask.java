
package arraylist;
import java.util.ArrayList;
public class ArrayListTask{
    public static int findLength(){
      ArrayList<String> list=new ArrayList<>();
      int length=list.size();
      return length;
    }
   public static ArrayList<String> findStringLength(String [] array){
      ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      return list;
    }
    public static ArrayList<Integer> findIntegerLength(int [] array){
      ArrayList<Integer> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      return list;
    }
    public static ArrayList<Object> createList(int [] array,String [] strArray,ArrayList<Student> customArrList){
       ArrayList<Integer> intList=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              intList.add(array[i]);
          }
       ArrayList<String> strList=new ArrayList<>();
          for(int i=0;i<strArray.length;i++){
              strList.add(strArray[i]);
          }
       ArrayList<Object> arrList=new ArrayList<>();
       arrList.addAll(intList);
       arrList.addAll(strList);
       arrList.addAll(customArrList);
      return arrList;
    }
     public static ArrayList<String> findIndex(String [] array,String str){
       ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      int length=list.size();
      int index=list.indexOf(str);
      System.out.println("Index of the element is:"+index);
      System.out.println("Length of the ArrayList :"+length);
      return list;
    }
   public static ArrayList<String> iterateArrayList(String [] array){
         ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
    return list;
  }
   public static ArrayList<String> findStringAtIndex(String [] array,int index){
       ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      String str=list.get(index);
      System.out.println("String at the given index is:"+str);
      return list;
    }
   public static int findIndexOfDuplicate(String [] array){
       ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      String str=null;
      for(int i=0;i<list.size();i++){
         for(int j=i+1;j<list.size();j++){
            if(list.get(i).equals(list.get(j))){
               str=list.get(j);
            }
         }
      }
      int firstIndex=list.indexOf(str);
      System.out.println("First index of the duplicate element is:"+firstIndex);
      int lastIndex=list.lastIndexOf(str);
      return lastIndex;
    }
   public static ArrayList<String> addString(String [] array,String str,int position){
       ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      list.add(position,str);
      return list;
    }
     public static ArrayList<String> createArrayList(String [] array,int startIndex,int endIndex){
       ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
      ArrayList<String> secondList=new ArrayList<>();
      for(int i=startIndex;i<endIndex;i++){
           secondList.add(list.get(i));
      }
      return secondList;
    }
   public static ArrayList<String> createThreeArrayList(String [] firstArray,String [] secondArray){
       ArrayList<String> firstList=new ArrayList<>();
          for(int i=0;i<firstArray.length;i++){
              firstList.add(firstArray[i]);
          }
       ArrayList<String> secondList=new ArrayList<>();
          for(int i=0;i<secondArray.length;i++){
              secondList.add(secondArray[i]);
          }
      ArrayList<String> thirdList=new ArrayList<String>();
      thirdList.addAll(firstList);
      thirdList.addAll(secondList);
      return thirdList;
    }
   public static ArrayList<String> createThirdArrayList(String [] firstArray,String [] secondArray){
      ArrayList<String> firstList=new ArrayList<>();
          for(int i=0;i<firstArray.length;i++){
              firstList.add(firstArray[i]);
          }
       ArrayList<String> secondList=new ArrayList<>();
          for(int i=0;i<secondArray.length;i++){
              secondList.add(secondArray[i]);
          }
      ArrayList<String> thirdList=new ArrayList<String>();
      thirdList.addAll(secondList);
      thirdList.addAll(firstList);
      return thirdList;
    }
   public static ArrayList<Double> removeDecimalValue(Double [] array,double decimalValue){
       ArrayList<Double> decimalList=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              decimalList.add(array[i]);
          }
      decimalList.remove(decimalValue);
      return decimalList;
    }   
   public static ArrayList<Double> removeDecimalValueAtIndex(Double [] array,int position){
       ArrayList<Double> decimalList=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              decimalList.add(array[i]);
          }
      decimalList.remove(position);
      return decimalList;
    } 
    public static ArrayList<Long> removeLongValue(Long [] array,int startIndex,int endIndex){
      ArrayList<Long> longList=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              longList.add(array[i]);
          }
      longList.subList(startIndex,endIndex).clear();
      return longList;
    }
   public static ArrayList<String> removeElements(String [] firstArray,String [] secondArray){
      ArrayList<String> firstList=new ArrayList<>();
          for(int i=0;i<firstArray.length;i++){
              firstList.add(firstArray[i]);
          }
       ArrayList<String> secondList=new ArrayList<>();
          for(int i=0;i<secondArray.length;i++){
              secondList.add(secondArray[i]);
          }
      firstList.removeAll(secondList);
      return firstList;
    }
   public static ArrayList<String> removeNonDuplicateElements(String [] firstArray,String [] secondArray){
      ArrayList<String> firstList=new ArrayList<>();
          for(int i=0;i<firstArray.length;i++){
              firstList.add(firstArray[i]);
          }
       ArrayList<String> secondList=new ArrayList<>();
          for(int i=0;i<secondArray.length;i++){
              secondList.add(secondArray[i]);
          }
      firstList.retainAll(secondList);
      return firstList;
    }
  public static ArrayList<Long> removeAllLongValue(Long [] array){
      ArrayList<Long> longList=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              longList.add(array[i]);
          }
      longList.removeAll(longList);
      return longList;
    }
  public static ArrayList<String> checkString(String [] array,String str){
        ArrayList<String> list=new ArrayList<>();
          for(int i=0;i<array.length;i++){
              list.add(array[i]);
          }
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
      return list;
    } 
}
    class Student{
       int rollNo;
       String name;
       int marks;
       Student(int rollNo,String name,int marks){
          this.rollNo=rollNo;
          this.name=name;
          this.marks=marks;
      }
      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }
