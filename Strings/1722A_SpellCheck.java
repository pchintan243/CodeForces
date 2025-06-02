package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 1722A_SpellCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        Set<String> knownStrings = new HashSet<>(Arrays.asList(
                "Timur","iTumr","rTimu","rTumi","Turim","Tirum","imTru","miurT","irumT","mTriu","umirT","riTmu","imrTu","uimTr","mrTui","rmTiu","iuTrm","uTirm","uTmri","irmuT","urTim","iurTm","riTum","muiTr","ruTim","Trmiu","Truim","iTmur","mriTu","mruTi","rTium","rTmui","iurmT","Tirmu","Tmriu","imruT","uTrmi","iTrmu","rimTu","riuTm","uiTmr","mirTu","umTir","imurT","miTru","umrTi","mruiT","mTuir","umTri","riumT","urimT","Tuimr","rmuiT","iumrT","Tmiur","rimuT","muriT","miruT","rumiT","Timru","Tiurm","iTmru","iTurm","iTrum","uTimr","miuTr","umiTr","mrTiu","muirT","urTmi","uimrT","rTmiu","rTuim","Turmi","Tmrui","mTiru","mTuri","uriTm","urmTi","Trimu","Trumi","uTrim","ruTmi","iuTmr","rmTui","Trium","Trmui","imTur","mTrui","umriT","Tumir","Timur","uirmT","irTmu","imuTr","muTri","uirTm","mriuT","rmiTu","rmuTi","uiTrm","urmiT","irTum","Tmuri","Tmiru","iumTr","ruiTm","rumTi","muTir","miTur","murTi","uTmir","ruimT","Tiumr","rmiuT","Tuirm","Tumri","Tmuir","irmTu","iruTm","mTiur"
        ));

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            if(n == 5 && knownStrings.contains(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
