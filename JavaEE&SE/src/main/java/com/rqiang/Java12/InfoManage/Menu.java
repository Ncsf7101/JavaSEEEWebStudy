package com.rqiang.Java12.InfoManage;

import java.util.ArrayList;

public class Menu {
    ArrayList<Object> pers = new ArrayList<>();
    Menu() throws Exception {
        InputData input = new InputData();
        Operate opr = new Operate();
        FileOperate fo = new FileOperate();
        boolean flag = true;
        int num = 0;
        while(flag){
            System.out.println("1. 增加数据");
            System.out.println("2. 删除数据");
            System.out.println("3. 修改数据");
            System.out.println("4. 查看数据");
            System.out.println("5. 存储数据");
            System.out.println("6. 载入数据");
            System.out.println("0. 系统退出");
            num = input.getInt("请输入你的选择...", "输入有误，请重新输入");
            switch (num){
                case 1:
                    opr.addPer(pers);
                    break;
                case 2:
                    opr.deletePer(pers);
                    break;
                case 3:
                    opr.updatePer(pers);
                    break;
                case 4:
                    for (Object p:pers) {
                        p.toString();
                    }
                    break;
                case 5:
                    fo.ser(pers);
                    break;
                case 6:
                    try{
                        pers = fo.dser();
                    }catch (Exception e){
                        System.out.println("导入失败！系统未存档");
                    }

                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
        System.out.println("谢谢您的使用，再见！");
    }

    public static void main(String[] args) throws Exception {
        new Menu();
    }
}
