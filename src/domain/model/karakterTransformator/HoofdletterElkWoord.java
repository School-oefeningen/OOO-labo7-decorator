package domain.model.karakterTransformator;

public class HoofdletterElkWoord extends KarakterTransformatorDecorator {

    public HoofdletterElkWoord(KarakterTransformatorInterface karakterTransformator) {
        super(karakterTransformator);
    }

    @Override
    public String transformString(String stringToTransform) {
        stringToTransform = super.transformString(stringToTransform);
        char[] characters = stringToTransform.toCharArray();
        String newString = "";

        for (int i = 0; i < characters.length; i++) {
            String letter = "";

            if (i == 0 || characters[i - 1] == ' ') {
                letter = String.valueOf(characters[i]).toUpperCase();
            } else {
                letter = String.valueOf(characters[i]);
            }

            newString += letter;
        }

        return newString;
    }
}
