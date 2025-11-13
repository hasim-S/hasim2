#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0) {
        return "";
    }

    if (strsSize == 1) {
        return strs[0];
    }

    char* prefix = strs[0];
    int prefixLen = strlen(prefix);
    for (int i = 1; i < strsSize; i++) {
        int j = 0;
        while (j < prefixLen && strs[i][j] != '\0' && prefix[j] == strs[i][j]) {
            j++;
        }
        prefixLen = j;
        if (prefixLen == 0) {
            return "";
        }
    }
    char* result = (char*)malloc(sizeof(char) * (prefixLen + 1));
    if (result == NULL) {
        return ""; 
    }
    strncpy(result, prefix, prefixLen);
    result[prefixLen] = '\0'; // Null-terminate the string

    return result;
}