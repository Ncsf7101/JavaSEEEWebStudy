package com.rqiang.Java12.InfoManage;

import java.util.ArrayList;

public class Operate {
    InputData input = new InputData();
    public void addPer(ArrayList<Object> pers) throws Exception {
        Person per = new Person(input.getString("输入姓名: "), input.getAge("输入年龄: ", "格式不正确"));
        if(pers.size() <= 200){
            pers.add(per);
        }else{
            System.out.println("人员已上限");
        }
    }

    public void deletePer(ArrayList<Object> pers) throws Exception {
        System.out.println("输入需要删除人的姓名与年龄");
        Person per = new Person(input.getString("输入姓名: "), input.getAge("输入年龄: ", "格式不正确"));
        if(!pers.remove(per)){
            System.out.println("未找到需要删除的对象");
        };
    }

    public void updatePer(ArrayList<Object> pers) throws Exception {
        int index = 0;
        System.out.println("输入要需要修改人的姓名与年龄");
        Person per1 = new Person(input.getString("输入姓名: "), input.getAge("输入年龄: ", "格式不正确"));
        if((index = pers.indexOf(per1)) == -1){
            System.out.println("未查询到修改对象");
        }else {
            System.out.println("修改为...");
            Person per2 = new Person(input.getString("输入姓名: "), input.getAge("输入年龄: ", "格式不正确"));
            pers.set(index, per2);
        }
    }
}
