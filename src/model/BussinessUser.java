package model;

import java.util.ArrayList;

public class BussinessUser extends User{

    private ArrayList<Page> listOfPages = new ArrayList<>();

    private String PVNNo;


    @Override
    public void setNameAndSurnameOrTitle(String nameAndSurnameOrTitle) {

    }

    @Override
    public void publishPost(PostType type, String msg) throws Exception {

    }

    public ArrayList<Page> getListOfPages() {
        return listOfPages;
    }

    public void setListOfPages(ArrayList<Page> listOfPages) {
        this.listOfPages = listOfPages;
    }

    public String getPVNNo() {
        return PVNNo;
    }

    public void setPVNNo(String PVNNo) {
        this.PVNNo = PVNNo;
    }
}
