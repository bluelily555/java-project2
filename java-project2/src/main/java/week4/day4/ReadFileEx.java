package week4.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    public List<String > getLines(String fileName) throws IOException{
        List<String> lines = new LinkedList<>();

        //자바 8에서 쓰던 버전.
        try(BufferedReader br8 = Files.newBufferedReader(
                Paths.get("1.hospital_info_202210.csv"), StandardCharsets.UTF_8
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
    public static void main(String[] args) throws IOException {
//
//        //FileReader 쓰는 방법 -> 인코딩 이슈 있음.
//        BufferedReader br11 = new BufferedReader(new FileReader("./1.hospital_info_202210.csv"));
//        System.out.println(br11.readLine());
//
//        //InputStreamReader 쓰는 방법 - 인코딩 지정 가능
//        BufferedReader br11Another = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\shia7\\Desktop\\멋사 백엔드스쿨\\미니프로젝트+데이터\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9/1.hospital_info_202210.csv"), "EUC-KR"));
//        System.out.println(br11Another.readLine());

        ReadFileEx
    }
}
