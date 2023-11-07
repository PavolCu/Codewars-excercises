package org.example;
public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder complement = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
                default:
                    complement.append(nucleotide);
            }
        }
        return complement.toString();
    }
}

