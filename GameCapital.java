import java.util.Scanner;
public class GameCapital {
    public static void main(String[] args) {
        int sum=0;
        System.out.println(".مرحبا بك في لعبة اختيار عاصمة الدوله المذكورة\n"
        +" [تتكون اللعبة من 5 اسئلة ايش هي عاصمة الدولة المذكوة 3 خيارات لكل سؤال وعليك ادخال رقم الاجابة الصحيحة:  ]");
        System.out.println("ايش هي عاصمة الكويت؟\n(1-القاهرة- 2الرياض- 3الكويت )");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       switch(n){
            case 1:
            System.out.println("اجابة خاطئة");
            break;
            case 2:
            System.out.println("اجابة خاطئة");
            break;
            case 3:
            System.out.println("اجابة صحيحة");
              sum+=2;
           break;
           default:
           System.out.println("اختيارك غير موجود");
       }
        System.out.println("ايش هي عاصمة مصر  ؟\n(1-القاهرة  2صنعاء-3 خرطوم  )");
        int r=in.nextInt();
       switch(r){
            case 1:
            System.out.println("اجابة صحيحة");
            sum+=2;
            break;
            case 2:
            System.out.println("اجابة خاطئة");
            break;
            case 3:
            System.out.println("اجابة  خاطئة");
           break;
           default:
           System.out.println("اختيارك غير موجود");
       }
        System.out.println("ايش هي عاصمة البرتغال  ؟\n(1-لشبونة2-فيينتيان 3-طوكيو)");
        int e=in.nextInt();
       switch(e){
            case 1:
            System.out.println("اجابة صحيحة");
            sum+=2;
            break;
            case 2:
            System.out.println("اجابة خاطئة");
            break;
            case 3:
            System.out.println("اجابة  خاطئة");
           break;
           default:
           System.out.println("اختيارك غير موجود");
       }
        
         System.out.println("لقد حصلت على "+sum+"من 6")   ;
            
        }
    }
    
