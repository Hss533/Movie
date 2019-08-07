package com.stylefeng.guns.rest.modular.vo;

/**
 * 返回信息是写在gateway上的
 * @param <M>
 */
public class ResponseVo<M> {

    //返回状态
    private int status;

    //返回信息
    private String msg;


    //返回数据实体
    private M data;

    private ResponseVo(){

    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }

    public  static <M> ResponseVo success(M m){
        ResponseVo responseVo=new ResponseVo();
        responseVo.setStatus(0);
        responseVo.setData(m);

        return responseVo;
    }
    public  static <M> ResponseVo success(String m){
        ResponseVo responseVo=new ResponseVo();
        responseVo.setStatus(0);
        responseVo.setMsg(m);

        return responseVo;
    }
    //业务异常
    public  static <M> ResponseVo serviceFail(String msg){
        ResponseVo responseVo=new ResponseVo();
        responseVo.setStatus(1);
        responseVo.setMsg(msg);

        return responseVo;
    }
    //系统异常
    public  static <M> ResponseVo systemFail(String fail){
        ResponseVo responseVo=new ResponseVo();
        responseVo.setStatus(999);
        responseVo.setMsg(fail);

        return responseVo;
    }


}
