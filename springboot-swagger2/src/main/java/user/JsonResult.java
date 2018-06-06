package user;

public class JsonResult {

    private String status = null;
    private Object result = null;

    public String getStatus() {
        return status;
    }

    public Object getResult() {
        return result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}