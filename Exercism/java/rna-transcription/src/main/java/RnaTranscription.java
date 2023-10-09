// class RnaTranscription {

//     String transcribe(String dnaStrand) {
//         throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
//     }

// }

class RnaTranscription {

    String transcribe(String Strand) {

        String result = "";
        for (int i = 0; i < Strand.length(); i++) {

            if (Strand.charAt(i) == 'G') {
                result += "C";

            } else if (Strand.charAt(i) == 'C') {
                result += "G";

            } else if (Strand.charAt(i) == 'T') {
                result += "A";

            } else if (Strand.charAt(i) == 'A') {
                result += "U";
            }
        }

        return result;
    }
}
