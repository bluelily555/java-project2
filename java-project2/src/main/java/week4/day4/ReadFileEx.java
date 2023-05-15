package week4.day4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    public List<String > getLines(String fileName) throws IOException{
        List<String> lines = new LinkedList<>();

        //자바 8에서 쓰던 버전.
        try(BufferedReader br8 = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8
        )) {
            String line;
            while((line = br8.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return lines;
    }

    public Hospital parse(String str){
        System.out.println(str);
        String[] splitted = str.split(",");
        System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }
    public static void main(String[] args) throws IOException {
//
//        //FileReader 쓰는 방법 -> 인코딩 이슈 있음.
        BufferedReader br11 = new BufferedReader(new FileReader("./hospital_info_101ines.csv", Charset.forName("UTF-8")));
        for (int i = 0; i < 9; i++) {
            System.out.println(br11.readLine());
//            br11.readLine();
             System.out.println(i);
        }


//        //InputStreamReader 쓰는 방법 - 인코딩 지정 가능
//        BufferedReader br11Another = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\shia7\\Desktop\\멋사 백엔드스쿨\\미니프로젝트+데이터\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9/1.hospital_info_202210.csv"), "EUC-KR"));
//        System.out.println(br11Another.readLine());

//        ReadFileEx rfe = new ReadFileEx();
//        rfe.getLines("1.hospital_info_202210.csv");
    }
}
