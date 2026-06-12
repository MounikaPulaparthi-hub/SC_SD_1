#include<stdio.h>

int main() {
    int choice;
    double temp, result;

    printf("=====================================\n");
    printf("      TEMPERATURE CONVERTER\n");
    printf("=====================================\n");

    printf("Choose Conversion:\n");
    printf("1. Celsius to Fahrenheit\n");
    printf("2. Celsius to Kelvin\n");
    printf("3. Fahrenheit to Celsius\n");
    printf("4. Fahrenheit to Kelvin\n");
    printf("5. Kelvin to Celsius\n");
    printf("6. Kelvin to Fahrenheit\n");
    printf("Enter your choice (1-6): ");
    scanf("%d", &choice);

    printf("Enter temperature value: ");
    scanf("%lf", &temp);

    switch (choice) {
        case 1:
            result = (temp * 9.0 / 5.0) + 32;
            printf("%.2lf Celsius = %.2lf Fahrenheit\n", temp, result);
            break;

        case 2:
            result = temp + 273.15;
            printf("%.2lf Celsius = %.2lf Kelvin\n", temp, result);
            break;

        case 3:
            result = (temp - 32) * 5.0 / 9.0;
            printf("%.2lf Fahrenheit = %.2lf Celsius\n", temp, result);
            break;

        case 4:
            result = ((temp - 32) * 5.0 / 9.0) + 273.15;
            printf("%.2lf Fahrenheit = %.2lf Kelvin\n", temp, result);
            break;

        case 5:
            if (temp < 0) {
                printf("Invalid Kelvin temperature! Kelvin cannot be negative.\n");
                return 1;
            }
            result = temp - 273.15;
            printf("%.2lf Kelvin = %.2lf Celsius\n", temp, result);
            break;

        case 6:
            if (temp < 0) {
                printf("Invalid Kelvin temperature! Kelvin cannot be negative.\n");
                return 1;
            }
            result = ((temp - 273.15) * 9.0 / 5.0) + 32;
            printf("%.2lf Kelvin = %.2lf Fahrenheit\n", temp, result);
            break;

        default:
            printf("Invalid choice! Please select between 1 and 6.\n");
    }

    return 0;
}