package domain.model.karakterTransformator;

public class SpatieAchterElkeLetter extends KarakterTransformatorDecorator {

    public SpatieAchterElkeLetter(KarakterTransformatorInterface karakterTransformator) {
        super(karakterTransformator);
    }

    @Override
    public String transformString(String stringToTransform) {
        stringToTransform = super.transformString(stringToTransform);
        char[] characters = stringToTransform.toCharArray();
        String newString = "";

        for (char character: characters) {
            String letter = "";

            if (character != ' ') letter += String.valueOf(character) + " ";
            else letter += String.valueOf(character);

            newString += letter;
        }

        return newString;
    }
}
