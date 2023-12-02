public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        doChange(drink);
    }

    @Override
    public void undo(StringDrink drink) {
        doChange(drink);
    }

    private void doChange(StringDrink drink) {
        if (drink == null || drink.getText() == null) return;
        drink.setText((new StringBuilder(drink.getText())).reverse().toString());
    }
}
