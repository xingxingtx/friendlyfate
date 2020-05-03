package com.wei.designphilosophy.three;

/**
*@describe  People
*@author  wei.peng
*@date  2020 05/03
*/
public class People {

    private IGoods goods;

    public People() {
    }

    /**
     * 构造器注入
     * @param goods
     */
    public People(IGoods goods) {
        this.goods = goods;
    }

    /**
     * 方法注入
     * @param goods
     */
     public void buy(IGoods goods){
         goods.buy();
     }

}
