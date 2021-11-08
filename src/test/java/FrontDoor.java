public class FrontDoor extends Door {
    public boolean isSwingsOut;
    public boolean isLocked;
    public FrontDoor(int doorHeight, int doorWidth, boolean isLocked, boolean isSwingsOut) {
        super(doorHeight, doorWidth);

    }
    public boolean openTheDoor() {
        if (this.isLocked) this.isLocked = false;
        return this.isLocked;
    }

}
