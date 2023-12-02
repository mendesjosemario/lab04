public class StringCaseChanger implements StringTransformer{

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
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < drink.getText().length(); i++) {
            if (Character.isLowerCase(drink.getText().charAt(i))) {
                stringBuilder.append(Character.toUpperCase(drink.getText().charAt(i)));
            } else {
                stringBuilder.append(Character.toLowerCase(drink.getText().charAt(i)));
            }
        }
        drink.setText(stringBuilder.toString());
    }
}
