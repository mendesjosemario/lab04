public class StringReplacer implements StringTransformer{

    private char find;
    private char replace;
    public StringReplacer(char find, char replace) {
        this.find = find;
        this.replace = replace;
    }

    @Override
    public void execute(StringDrink drink) {
        doChange(drink, find, replace);
    }

    @Override
    public void undo(StringDrink drink) {
        doChange(drink, replace, find);
    }

    private void doChange(StringDrink drink, char find, char replace) {
        drink.setText(drink.getText().replace(find, replace));
    }
}
