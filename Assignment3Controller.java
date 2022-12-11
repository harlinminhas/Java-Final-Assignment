package com.example.finalassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;



public class Assignment3Controller {

    @FXML
    private ColorPicker colorPick;

    @FXML
    private TextField pupilName;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private Pane pane7;

    @FXML
    private Pane pane8;

    @FXML
    private Pane pane9;
    @FXML
    private Text s1;

    @FXML
    private Text s2;

    @FXML
    private Text s3;

    @FXML
    private Text s4;

    @FXML
    private Text s5;

    @FXML
    private Text s6;
    @FXML
    private Label msgError;

    @FXML
    private Text s7;

    @FXML
    private Text s8;

    @FXML
    private Text s9;


    ArrayList<Integer> array = new ArrayList<Integer>(10);

    int flag=0;



    int RFunc(int randomNum){

        while(true){
            Random rand = new Random();
            int max = 9;
            int min = 1;
            int range = max - min + 1;
            int ran = (int) (Math.random() * range) + min;

            if(array.contains(ran)){
                continue;
            }else{
                array.add(ran);
                return ran;

            }
        }
    }


    @FXML
    void onGenerate(ActionEvent event) throws Exception {
        Random rand = new Random();
        int wrong=0;
        String FLNAME=pupilName.getText();
        Color color= colorPick.getValue();
        if(flag==9){
            msgError.setVisible(true);
            msgError.setText("ALL SEATS TAKEN!! NO MORE");
        }
        int randomnum= rand.nextInt(1,10);

        int num = RFunc(randomnum);



        if(s1.getText().compareTo(FLNAME)==0||s2.getText().compareTo(FLNAME)==0||s3.getText().equals(FLNAME)
                ||s4.getText().equals(FLNAME)||s5.getText().equals(FLNAME)||s6.getText().equals(FLNAME)||
                s7.getText().equals(FLNAME)||s8.getText().equals(FLNAME)||s9.getText().equals(FLNAME)){
            wrong=1;

            array.remove(array.indexOf(num));
        }

        if(color.toString().equals("0xffffffff"))
            wrong=2;
        if(pane1.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)) || pane2.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pane3.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pane4.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pane5.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pane6.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
    ||pane7.getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
       ||pane8. getStyle().equals("-fx-background-color: #"+color.toString().substring(2))
        ||pane9.getStyle().equals("-fx-background-color: #"+color.toString().substring(2)))
            wrong=2;

        if(FLNAME.isEmpty()){
            wrong=90;
            msgError.setText("Please enter NAME");
            msgError.setVisible(true);
            array.remove(num);
            array.remove(array.indexOf(num));
        }
        if(wrong==0){
            flag++;
            if(num==1){
                msgError.setVisible(false);
                pane1.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s1.setText(FLNAME);
                s1.setVisible(true);

                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==2){
                msgError.setVisible(false);
                pane2.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s2.setText(FLNAME);
                s2.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==3){
                msgError.setVisible(false);
                pane3.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s3.setText(FLNAME);
                s3.setVisible(true);

                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==4){
                msgError.setVisible(false);
                pane4.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s4.setText(FLNAME);
                s4.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==5){
                msgError.setVisible(false);
                pane5.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s5.setText(FLNAME);
                s5.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==6){
                msgError.setVisible(false);
                pane6.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s6.setText(FLNAME);
                s6.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==7){
                msgError.setVisible(false);
                pane7.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s7.setText(FLNAME);
                s7.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==8){
                msgError.setVisible(false);
                pane8.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s8.setText(FLNAME);
                s8.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }

            }
            if(num==9){
                msgError.setVisible(false);
                pane9.setStyle("-fx-background-color: #" +color.toString().substring(2));
                s9.setText(FLNAME);
                s9.setVisible(true);
                if(flag==9){
                    msgError.setVisible(true);
                    msgError.setText("CONGRATS! ATTENDANCE FULL");

                }
            }
        }

        else if(wrong==1) {
            msgError.setText("STUDENT NAME TAKEN!!");
            msgError.setStyle("-fx-background-color: rgba(255,0,0)");
            msgError.setVisible(true);

            array.remove((Integer) num);

        }
        else if(wrong==2) {
            msgError.setText("INVALID COLOR");
            msgError.setStyle("-fx-background-color: rgba(255,0,0)");
            msgError.setVisible(true);

            array.remove(array.indexOf(num));

        }
        else {
            msgError.setVisible(false);
            msgError.setText("SEATS ARE FULL!!");
            msgError.setStyle("-fx-background-color: rgba(255,0,0,.4)");
            msgError.setVisible(true);
        }
    }
    @FXML
    void initialize(){
        s1.setVisible(false);
        s3.setVisible(false);
        s2.setVisible(false);
        s4.setVisible(false);
        s5.setVisible(false);
        s6.setVisible(false);
        s7.setVisible(false);
        s8.setVisible(false);
        s9.setVisible(false);
        msgError.setVisible(false);
    }


}