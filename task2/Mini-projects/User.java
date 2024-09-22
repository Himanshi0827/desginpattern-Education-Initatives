
class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return username;
    }
}
