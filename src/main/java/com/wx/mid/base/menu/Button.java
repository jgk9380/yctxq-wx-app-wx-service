package com.wx.mid.base.menu;

/**
 * 按钮的基类
 *
 * @author liufeng
 * @date 2013-10-14
 */
public class Button {
    private String name;

    public Button() {
        super();
    }

    public Button(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
