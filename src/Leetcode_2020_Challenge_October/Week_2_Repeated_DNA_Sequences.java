package Leetcode_2020_Challenge_October;

import java.util.*;

public class Week_2_Repeated_DNA_Sequences {
    public static void main(String[] args) {
        String s  = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        s = "CCAAGTCTAAAAGAATGGGCAGAGTTGCTCTGCACGTTCCGGATACGATAAGAAGACTCCGCCGGGCACCGCCAGTCCCTCGCAGGGGGACACATTGGAATCGGATAATCGATCACTCCGCGCCACCCCGGGTTACGCACCTCACGTTGAGTGAGGAGATGGTGACATTTCGGCACCTATAGGCACGCTCTACCGGAACAGCATCTGTATCAGATGGCAATTCGATGGTATCTTGCGTGAATCAGGAAGTTTTATGTGGCTTCCGGATGACGCGAGATTTTGCGTGAGGTGAGCGGTTGCGTTACCGGTTAGTAGCCCTTAGTAGTTGAAGACAGGCGAGCAGGTGCAGCTGTCCACACGGTATAGGGCAATCAACTTCCATAAAGCATATGTTGTGTAACACCTGCCACCCCTTGTCACAGGTTTCACCAAGACCACATCGTGCTAAAGTTAAACAACATTCGTAAAAGTGCAGAAATTGAAGTATTTGATCTGAGATTACGTTTCAATCTGGAATCCGAAGCTATAGGAGAATGTTGGACCATACGGTGAGTAGAATCGCCACTCACGTTTCGGTACTAGCACATTAGTACGGATCCCGATCGGGGTGGTGGGGCGTTCTTCATGTATACCATTGCGACGGAGTCTGGCTAAACCTTTAGGCAGGTCGCAAGGCAGAATCATGAGCACAATCAGGGTGGCCTGGATCCGTCATGGAGGAATCGGGTCTTCCCGTTTGAGGGGGCGGACTTCGCGGCGCACGTCAGGACACCAAAGGCTCTAGTACCCTCCTATCGAAACTCTTTAGCGAGTTTTGTCCAGCTAGCTTCATCTAACAGGCTCAAAAGTCATAAGAAGGCTCACTTTAAGTAAAAAGTCAGGCGCAAAGTCTAGTGGCGCATTTGATACGTTCCCAGGGCACACATGCACCCCTCTGCAACATTTCAGGCCGCAATTACACTGTAGCTCACCGGGGTCGAAATAGTTAACTCAAGTTTCCGGTCCCTTCCCCACAAAGATCTGTATATGAACCATCAAGACGTGGCTAATAATTATATCTCCGGCCCCTGCCACAGGAGAGAGGGAGCCGGAATGACCGTAATTAGCTCATAAAACTTACCAGCTTATAGGAAGTCGGCTTCTTTGATGACTACGAAATGGTAGGGCGTTCGTTATGTGCTCTCGCGTTCAACATCCGGCGCGACCAATATGCCAACATTCGGAAGCGTGTGATAAATTGCTGAATCCATAGTCCCATAGTGGTTGATAGTTACTCCGGTTCTGAACTTGTGTAATAAATGCCAACATTCTCGTTACTCAGAACGACAGTCAAAGTGCGTGTCACGTTGGGCCTGGGGCACGTCGCTGGTATTCGGGTACTTTACTAATGAATAAGGATTGTGTTGTAGGCCCCTTAAAAACAGGGAATGGGCCGAATACATTTAGCTTGATTCCAGCGGTAGTACTTGGCGGAGTCATGTACCTTACCCGCGCATATAACTCCAGTCGGACATACGTTAGAATTTTGAAAAGGCTGGCGGGGACCGCGAGATGTCCGCCACCCATGTCGCGGCGTGAGGTGACATGACAGCCAGGCAGTTGGCTCGGTGTCCCAGGTGCACGGCCTCACTTAAACTAGCACCCGACGGATTCTTCATACCTGACGTGTGTATTTTTTGACTCTGAGGTTCTGAATAACATCCGTAGGCACATGTGAGAGCAGGGACGGTTCATCACCTATGGTCTCCAGGTACAGCCTACGTGGGGTAGGACCACAACACTCTGTGTGCCATACGGTCGGTCAAGACCTAATGGCGGGAAAAGTGGCTTTAGTCCCGTTGTACGAGGGAAATCAGTTTGGTTACGTGAAAAGTTAATGCTGCATCCAGTGACTACGATATTACCCGGCGAAACGAGATCGTAGTAGTTCTATGTCGGGCTGTCACCTAAGACACCATAAAAGGCGATTAAATATGGATGTGCGGAAGGGTGACTTCTACCCTCAAGACAACTGACTACCACCTTATACGCGCTTCATCGGGAGCTAGCGAGGCGCATCGCACAGTTACAAAGGGGTGTGGTAGGCACCCTGAACACAGAGAGTCACGCCGTGGGAAGACGACGGCGCCCGAACTGCTATCAGCTTCAAACTTCCAACGCCCATCGCGAGCGTACTGAGTTTTCACAGCGGGCTTCCACAAAGAAGTGGCCAGGCGACACCACATTACTGGGTCTGAGCCTCAGGCCAGGCGAAGTAATTGGTTTTGTGGGAATAGTGCACAAATGACCCATATGTGTTGTCAAGTCCCCTGCGACCGTTCGTCGGCGTACCCTTCGCTAATTTCCTAAGCACAATAATTGCAACCCCAAATGAGTCTCGTATTAGAGTAACGCAGAGTTAGGCTCCCCGAAAACGCTAGTCCGGAGCTTGGGATAAAAATAATGATGTAGGGCGGGACCCCGTACTTTCGCATAACAGGGTTTTTGTCGGTTGGCTTGTAAATGCAACTTGGGTTCCACAATCCCACTGGACAAGACAGGAAGGTGAAGAGGGAGCCGATTAAACCCAACTCAACTAGAACTTAGATCTTTCATTCACATCGTGTCAGTACAAATTTGAAAGAGAAGTAGGTACATGGGAGGAACGGGTTACGCCGAGTCTGATATTCTGTGGGAACTCCGTCTGGTCGCAGAGTTACGCCATCACAGCATTGGCTGAGTATCCAATTTGCCTATCACGCAACTACCATTTGCCGATAGCGGACCGACCCTATTTGAGCTATGGTATGTTCACGAATACAACTACGTCTGACAAGACGAGATCCTAAGCACAACTCCTACGATTCCGGACGTCTGGCCCTTGGAGCACTAATCCCTGGGGAATGTCACCAGAGATGTTTACGGCATGAAGAATGGAGGTCACAATTATTGAGAGACGGCGGTATGCACCATATCCAGGGTGCAGTGAGACGATAGACGTAGGGGAGCGGAGCGTCGAGGTGTCTCTGCCAAAGGGCCCCAATGATCCTGAATGGTGTAATCCGGAGACTCGATGGTATCCGCCGCAACGGTTCACTCCGCGTATGGCAGTTGGCTACGTGGTCGCGAGGACAGCTGTACGTTAAGCTAAACGATCCCTTAGCCTCTCGCAGATCGAAGTGCTAATAGTCCTGTCGCAGCCAGGATTGCGAAACTACGACTCAGGGGTAATCGCGGATAGCCTGATTTCATCCGAAAGACCCACACTATAGTCTGTGGTCGGTCCCAGGCGGTTCACGCCACCGGCGACATCGGCAAGTCTACAGGGGTTGGGCCAATTTCCGATAGGATCTCGGAAATGGTATCTCCGACCAGCGCAAACGCGCCACCCTGCGAGTCCGGAGTTTGCTACTCTTCAAATGAACCGATCGCGTCGTCGTTGAAACCGTGAGAGCAACCAGAATTACATTAAGCTCATCGGGATATTGATCCAATTGGGTAAATGTCAACGCTTCAATTTTTGCCGTGTCGCAACCTCCGGATAAACTTAGTACAGATCTTTTGTCGTAGAACGTTGTGGAAGCAGCAGGGAGACCCTGTACTTTCGTCACCTATCAACGTTTCCACCTCTGGTGATGTAAAAGCACGCAACCTACTCCGATACCAATCTGAGTTATGCTGTAAATTATTGGACGCCAATGGGATAAATGGGTAACGTGACCGATACGAAGCTGGCCCTTTCTCCCTCCAGTACCGATGGAATCTAGTACTTTTATAATGATTGGCACGGACGCACCGGTGTGGTTGACCGATTTGGCGGTAACATTGCGGGTTAGGGGGTTAATATATAACGCCTTCACCGATCGCACTACACGCAGATCGGAGGCTCCACTCAGACGTAGAATTTAAACAGAGATGGCTAGCGAAACTCCAAGCAGACGGCAAGGCTGTTCACCAGGAAGCCCCCTTCAAGATTCGTATTCAGGTATTGAGCAAACATCACTGACATTATTTTTGGATTAGCATAGGAAATATATACCGACTCGCGGTGGAGGTCAATGTCAACAGTGCGTGTTTTTAATGTCTGAACAATTTGCCTCCAAAATCTTGTTCGTTATCTCCCGATCAATTACCGCTAGCATTCGGGCATCTTGCGACCCAAGATTGAGATGAGGTGTGAACACTATCTGCACTGACAGCGGTCATAGCGGCGTAAAAATCGTGCGGAGGGAACCTTCACTCATGAGCAGCGGTGTAAAACCCTATGAGACAATTCGCTCCGATGGATAGTGTTGCGCTGACGTCCCACCGGACCAGCAGATATTCAACTCGAGAACATCTTAAAGTTTCCATCTAGGGCGGACCCTCAGGCTTTGCACGTCGGGGCTTAATGGTAATATGAGGTACGATTTAGTCGAATGGTTAAAGACCGTGACCGTGATATGCGCAACAATTCCCTCTGATACCCACTCATCGGGGTGGATTCTGAACACAGTCTGCATAAGTCTCAACCCATGGACGGGGAACTGTTACGAAATATGCAGGGGTCCGATTAGTCCCAGGGTGAGTCTTCCCTTACCGATCTCCACCGTGTTCCATGAGTCGCCGGTGTTTGATTACTGTCTATAGGCCTTACCGTCGTTACTGAGATTTATGGGCGGGGACGTTCGACTGCACTTTCAATTGGCAGAATTCCGTTAAATAAGGACGCAGTTGTCCGCGCACTTCATACCGTTGAGAAAGCAATACATTTTCTTGACACTCCCGGCATGTCGTCATATAGTACCGTCTAGCATTCTGCTAGCTCAAAAGCTCTCTGGCACCGGCATGTGTGACGTATCGAAAGAACAGCACTACAGCAGGCGAGTAGCTCCGGGCTACTTTGTTGCACAGCTACATGCAGTGGTGGTAACTTCGATTGATCCCGGCTCTAGGACTGAGCTTTAGCGAGTCCCTACCCGGCAAGTTCGCCTGATCCTGTCTTGGATGAACTTGGGCGGGCTCTGGCGGGTTGTTAGATC";

        System.out.println(findRepeatedDnaSequences(s).toString());

    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> results = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        String subS;
        for (int i = 0; i < s.length() - 9; i++) {
            subS = s.substring(i, i + 10);
            if (!duplicate.add(subS)) {
                results.add(subS);
            }
        }
        return new ArrayList<>(results);
    }
}

/*
    Should create an unique key for each String --> Reduce memory usage
 */
