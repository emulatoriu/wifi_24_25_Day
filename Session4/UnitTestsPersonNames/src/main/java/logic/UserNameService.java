package logic;

public class UserNameService {
    public boolean checkIfPalindrom(String name) {
        String lowerCaseName = name.toLowerCase();
        return new StringBuilder(lowerCaseName)
                .reverse()
                .toString()
                .equals(lowerCaseName);
    }

    public boolean checkIfNameShorterThan(String name, int maxLength) {
        return name.length() < maxLength;
    }
}
