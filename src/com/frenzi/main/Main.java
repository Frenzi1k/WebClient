package com.frenzi.main;

import com.frenzi.webservice.File;
import com.frenzi.webservice.FileService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.util.ArrayList;


public class Main  extends JFrame implements ActionListener{
    private FileService fileService;
    private Button buttonGet = new Button("Show files");
    private List list = new List();

    public Main(){
        super("Client");
        this.setSize(200, 200);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0, 155,255));
        this.setResizable(false);

        buttonGet.setSize(100,40);
        buttonGet.setLocation((this.getWidth() - buttonGet.getWidth()) / 2, 130);
        this.add(buttonGet);
        buttonGet.addActionListener(this);

        list.setSize(100,120);
        list.setLocation((this.getWidth() - list.getWidth()) / 2, 0);
        list.setVisible(false);
        this.add(list);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        list.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2){
                    openFile(e);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.fileService = new FileService();

        this.setVisible(true);
    }

    private void openFile(MouseEvent e){
        List tempList = (List)e.getSource();
        java.io.File file = saveFile(tempList.getItem(tempList.getSelectedIndex()));
        try {
            if (file != null) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().edit(file);
                }
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private java.io.File saveFile(String name){
        byte[] myFile = fileService.getFilePort().getFile(name);
        java.io.File file = null;
        try {
            file = new java.io.File(String.format("res/%s", name));
            Files.write(file.toPath(), myFile);
            return file;
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return  null;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonGet){
            this.list.removeAll();
            if (!this.list.isVisible()){
                this.list.setVisible(true);
            }
            try {
                for (String name : fileService.getFilePort().getFilesName(InetAddress.getLocalHost().getHostAddress())) {
                    System.out.println(name);
                    list.add(name);
                }
            }catch (UnknownHostException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args){
        new Main();
        /*FileService fileService = new FileService();
        for (String str:fileService.getFilePort().getFilesName("12:12:12")) {
            System.out.println(str);
        }
        byte[] myFile = fileService.getFilePort().getFile("f1.txt");
        try {
            Files.write(new java.io.File(String.format("res/%s", "f1.txt")).toPath(), myFile);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }*/
    }
}
