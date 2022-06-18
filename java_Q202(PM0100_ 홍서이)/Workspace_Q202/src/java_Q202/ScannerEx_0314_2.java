package java_Q202;


import java.util.Scanner;

public class ScannerEx_0314_2 {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("한글 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("영어 이름을 입력해주세요 : ");
        String EnName = sc.nextLine();
        System.out.print("주민등록번호를 입력해주세요 : (ex. xxxxxx-xxxxxxx)" + " ");
        String PersonalNum = sc.nextLine();
        while(PersonalNum.length() != 14 || (
                PersonalNum.charAt(8) != '1' &&
                        PersonalNum.charAt(8) != '2' &&
                        PersonalNum.charAt(8) != '3' &&
                        PersonalNum.charAt(8) != '4')){
            System.out.println("잘못입력하셨습니다.");
            System.out.print("주민등록번호를 입력해주세요 : (ex. xxxxxx-xxxxxxx)" + " ");
            PersonalNum = sc.nextLine();
        }
        System.out.print("학교를 입력해주세요 : ");
        String School = sc.nextLine();
        System.out.print("학과를 입력해주세요 : ");
        String Major = sc.nextLine();
        System.out.print("전공을 입력해주세요 : ");
        String SubMajor = sc.nextLine();
        System.out.print("사용할 수 있는 프로그램 언어 입력해주세요 : ");
        String Lan = sc.nextLine();
        System.out.print("보유한 자격증을 입력해주세요 : ");
        String License = sc.nextLine();
        System.out.print("이메일을 입력해주세요 : ");
        String Email = sc.nextLine();
        System.out.print("전화번호를 입력해주세요 : ");
        String PhoneNum = sc.nextLine();
        System.out.print("수상경력을 입력해주세요 : ");
        String Awards = sc.nextLine();
        System.out.print("주소를 입력해주세요 : ");
        String Address = sc.nextLine();
        System.out.print("자기소개 입력해주세요 : ");
        String Introduce = sc.nextLine();


        //변수 조정
        PersonalNum = PersonalNum.substring(0,7) + PersonalNum.substring(8,9)+"******";

        // 출력
        System.out.println("\n\n");
        System.out.println("-------------------------------------");
        System.out.println("한글 이름 :\t" + name);
        System.out.println("영어 이름 : " + "\t"+ EnName);
        System.out.println("주민등록번호 : " + "\t" + PersonalNum);
        System.out.println("학교 이름:" + "\t" + School);
        System.out.println("학과 이름 :\t" + Major);
        System.out.println("전공 이름 :\t" + SubMajor);
        System.out.println("사용 언어 :\t" + Lan);
        System.out.println("자격증 :\t" + License);
        System.out.println("이메일 :\t" + Email);
        System.out.println("전화번호 :\t" + PhoneNum);
        System.out.println("수상경력 :\t" + Awards);
        System.out.println("주소 :\t" + Address);
        System.out.println("자기소개 :\t" + Introduce);
    }
}