package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqa.main.RomanNumerals;

public class RomanTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    //-------------------------- TS001 - Positive Test --------------------------//

    // Test for Single digit

    // TC001: Input = I → Expected = 1
    @Test
    public void testI() {
        assertEquals(1, romanNumerals.convertRomanNumToInt("I"));
    }

    // TC002: Input = V → Expected = 5
    @Test
    public void testV() {
        assertEquals(5, romanNumerals.convertRomanNumToInt("V"));
    }

    // TC003: Input = X → Expected = 10
    @Test
    public void testX() {
        assertEquals(10, romanNumerals.convertRomanNumToInt("X"));
    }

    // TC004: Input = L → Expected = 50
    @Test
    public void testL() {
        assertEquals(50, romanNumerals.convertRomanNumToInt("L"));
    }

    // TC005: Input = C → Expected = 100
    @Test
    public void testC() {
        assertEquals(100, romanNumerals.convertRomanNumToInt("C"));
    }

    // TC006: Input = D → Expected = 500
    @Test
    public void testD() {
        assertEquals(500, romanNumerals.convertRomanNumToInt("D"));
    }

    // TC007: Input = M → Expected = 1000
    @Test
    public void testM() {
        assertEquals(1000, romanNumerals.convertRomanNumToInt("M"));
    }

    // Test for Two Digits First Smaller

    // TC008: Input = IV → Expected = 4
    @Test
    public void testIV() {
        assertEquals(4, romanNumerals.convertRomanNumToInt("IV"));
    }

    // TC009: Input = IX → Expected = 9
    @Test
    public void testIX() {
        assertEquals(9, romanNumerals.convertRomanNumToInt("IX"));
    }

    // TC010: Input = XL → Expected = 40
    @Test
    public void testXL() {
        assertEquals(40, romanNumerals.convertRomanNumToInt("XL"));
    }

    // TC011: Input = XC → Expected = 90
    @Test
    public void testXC() {
        assertEquals(90, romanNumerals.convertRomanNumToInt("XC"));
    }

    // TC012: Input = CD → Expected = 400
    @Test
    public void testCD() {
        assertEquals(400, romanNumerals.convertRomanNumToInt("CD"));
    }

    // TC013: Input = CM → Expected = 900
    @Test
    public void testCM() {
        assertEquals(900, romanNumerals.convertRomanNumToInt("CM"));
    }

    // Test for Two Digits First Larger

    // TC014: Input = VI → Expected = 6
    @Test
    public void testVI() {
        assertEquals(6, romanNumerals.convertRomanNumToInt("VI"));
    }

    // TC015: Input = XI → Expected = 11
    @Test
    public void testXI() {
        assertEquals(11, romanNumerals.convertRomanNumToInt("XI"));
    }

    // TC016: Input = LX → Expected = 60
    @Test
    public void testLX() {
        assertEquals(60, romanNumerals.convertRomanNumToInt("LX"));
    }

    // TC017: Input = CX → Expected = 110
    @Test
    public void testCX() {
        assertEquals(110, romanNumerals.convertRomanNumToInt("CX"));
    }

    // TC018: Input = DC → Expected = 600
    @Test
    public void testDC() {
        assertEquals(600, romanNumerals.convertRomanNumToInt("DC"));
    }

    // TC019: Input = MC → Expected = 1100
    @Test
    public void testMC() {
        assertEquals(1100, romanNumerals.convertRomanNumToInt("MC"));
    }

    // Test for Two Digits Same Number

    // TC020: Input = II → Expected = 2
    @Test
    public void testII() {
        assertEquals(2,romanNumerals.convertRomanNumToInt("II"));
    }

    // TC021: Input = XX → Expected = 20
    @Test
    public void testXX() {
        assertEquals(20, romanNumerals.convertRomanNumToInt("XX"));
    }

    // TC022: Input = CC → Expected = 200
    @Test
    public void testCC() {
        assertEquals(200, romanNumerals.convertRomanNumToInt("CC"));
    }

    // TC023: Input = MM → Expected = 2000
    @Test
    public void testMM() {
        assertEquals(2000, romanNumerals.convertRomanNumToInt("MM"));
    }

    // Test for Multiple Digits Same Number

    // TC024: Input = III → Expected = 3
    @Test
    public void testIII(){
        assertEquals(3, romanNumerals.convertRomanNumToInt("III"));
    }

    // TC025: Input = XXX → Expected = 30
    @Test
    public void testXXX(){
        assertEquals(30, romanNumerals.convertRomanNumToInt("XXX"));
    }

    // TC026: Input = CCC → Expected = 300
    @Test
    public void testCCC(){
        assertEquals(300, romanNumerals.convertRomanNumToInt("CCC"));
    }

    // TC027: Input = MMM → Expected = 3000
    @Test
    public void testMMM() {
        assertEquals(3000, romanNumerals.convertRomanNumToInt("MMM"));
    }

    //Test for Multiple Digits First Digit is Larger Than The Rest

    // TC028: Input = VII → Expected = 7
    @Test
    public void testVII() {
        assertEquals(7,romanNumerals.convertRomanNumToInt("VII"));
    }

    // TC029: Input = XIV → Expected = 14
    @Test
    public void testXIV() {
        assertEquals(14, romanNumerals.convertRomanNumToInt("XIV"));
    }

    // TC030: Input = XXI → Expected = 21
    @Test
    public void testXXI(){
        assertEquals(21, romanNumerals.convertRomanNumToInt("XXI"));
    }

    // TC031: Input = XXVI → Expected = 26
    @Test
    public void testXXVI(){
        assertEquals(26, romanNumerals.convertRomanNumToInt("XXVI"));
    }

    // TC032: Input = LXXVI → Expected = 76
    @Test
    public void testLXXVI(){
        assertEquals(76,romanNumerals.convertRomanNumToInt("LXXVI"));
    }

    // TC033: Input = LXIV → Expected = 64
    @Test
    public void testLXIV(){
        assertEquals(64,romanNumerals.convertRomanNumToInt("LXIV"));
    }

    // TC034: Input = CCLXIV → Expected = 264
    @Test
    public void testCCLXIV(){
        assertEquals(264,romanNumerals.convertRomanNumToInt("CCLXIV"));
    }

    // TC035: Input = CLXXVI → Expected = 176
    @Test
    public void testCLXXVI() {
        assertEquals(176, romanNumerals.convertRomanNumToInt("CLXXVI"));
    }

    // TC036: Input = DCLXIV → Expected = 664
    @Test
    public void testDCLXIV() {
        assertEquals(664, romanNumerals.convertRomanNumToInt("DCLXIV"));
    }

    // TC037: Input = DLVI → Expected = 556
    @Test
    public void testDLVI(){
        assertEquals(556,romanNumerals.convertRomanNumToInt("DLVI"));
    }

    // TC038: Input = MMDLXIV → Expected = 2564
    @Test
    public void testMMDLXIV() {
        assertEquals(2564, romanNumerals.convertRomanNumToInt("MMDLXIV"));
    }

    // TC039: Input = MDXVI → Expected = 1516
    @Test
    public void testMDXVI(){
        assertEquals(1516, romanNumerals.convertRomanNumToInt("MDXVI"));
    }

    //Test for Multiple Digits First Digit is The Largest Number and The Rest is The Combination of (2), (3), (4)

    // TC040: Input = CIV → Expected = 104
    @Test
    public void testCIV(){
        assertEquals(104, romanNumerals.convertRomanNumToInt("CIV"));
    }

    // TC041: Input = CVI → Expected = 106
    @Test
    public void testCVI(){
        assertEquals(106, romanNumerals.convertRomanNumToInt("CVI"));
    }

    // TC042: Input = CXXX → Expected = 130
    @Test
    public void testCXXX(){
        assertEquals(130, romanNumerals.convertRomanNumToInt("CXXX"));
    }

    // TC043: Input = CXLVI → Expected = 146
    @Test
    public void testCXLVI(){
        assertEquals(146, romanNumerals.convertRomanNumToInt("CXLVI"));
    }

    // TC044: Input = MXXVI → Expected = 1026
    @Test
    public void testMXXVI(){
        assertEquals(1026, romanNumerals.convertRomanNumToInt("MXXVI"));
    }

    // TC045: Input = MXXIV → Expected = 1024
    @Test
    public void testMXXIV(){
        assertEquals(1024, romanNumerals.convertRomanNumToInt("MXXIV"));
    }

    // TC046: Input = MCCXLVI → Expected = 1246
    @Test
    public void testMCCXLVI(){
        assertEquals(1246, romanNumerals.convertRomanNumToInt("MCCXLVI"));
    }

    //-------------------------- TS002 - Negative Test --------------------------//

    // -1 for Invalid

    // Test Not a Roman Numeral Number

    // TC001: Input = A → Expected = -1
    @Test
    public void testCharA(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("A"));
    }

    // TC002: Input = B → Expected = -1
    @Test
    public void testCharB(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("B"));
    }

    // TC003: Input = E → Expected = -1
    @Test
    public void testCharE(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("E"));
    }

    // TC004: Input = F → Expected = -1
    @Test
    public void testCharF(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("F"));
    }

    // TC005: Input = G → Expected = -1
    @Test
    public void testCharG(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("G"));
    }

    // TC006: Input = H → Expected = -1
    @Test
    public void testCharH(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("H"));
    }

    // TC007: Input = J → Expected = -1
    @Test
    public void testCharJ(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("J"));
    }

    // TC008: Input = K → Expected = -1
    @Test
    public void testCharK(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("K"));
    }

    // TC009: Input = N → Expected = -1
    @Test
    public void testCharN(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("N"));
    }

    // TC010: Input = O → Expected = -1
    @Test
    public void testCharO(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("O"));
    }

    // TC011: Input = P → Expected = -1
    @Test
    public void testCharP(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("P"));
    }

    // TC012: Input = Q → Expected = -1
    @Test
    public void testCharQ(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("Q"));
    }

    // TC013: Input = R → Expected = -1
    @Test
    public void testCharR(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("R"));
    }

    // TC014: Input = S → Expected = -1
    @Test
    public void testCharS(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("S"));
    }

    // TC015: Input = T → Expected = -1
    @Test
    public void testCharT(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("T"));
    }

    // TC016: Input = U → Expected = -1
    @Test
    public void testCharU(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("U"));
    }

    // TC017: Input = W → Expected = -1
    @Test
    public void testCharW(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("W"));
    }

    // TC018: Input = Y → Expected = -1
    @Test
    public void testCharY(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("Y"));
    }

    // TC019: Input = Z → Expected = -1
    @Test
    public void testCharZ(){
        assertEquals(-1, romanNumerals.convertRomanNumToInt("Z"));
    }

    // Test for Using Wrong Repeating Digits

    // TC020: Input = VV → Expected = -1
    @Test
    public void testVV() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("VV"));
    }

    // TC021: Input = LL → Expected = -1
    @Test
    public void testLL() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("LL"));
    }

    // TC022: Input = DD → Expected = -1
    @Test
    public void testDD() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("DD"));
    }

    // Test for Using More Than Three Repeating Roman Numerals

    // TC023: Input = IIII → Expected = -1
    @Test
    public void testIIII() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("IIII"));
    }

    // TC024: Input = XXXX → Expected = -1
    @Test
    public void testXXXX() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("XXXX"));
    }

    // TC025: Input = CCCC → Expected = -1
    @Test
    public void testCCCC() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("CCCC"));
    }

    // TC026: Input = MMMM → Expected = -1
    @Test
    public void testMMMM() {
        assertEquals(-1, romanNumerals.convertRomanNumToInt("MMMM"));
    }

}


