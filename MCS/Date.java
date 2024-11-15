// HELLO WORLD
package MCS;

import java.time.LocalDate;
import java.time.Period;

    public abstract class Date {
        /**
         * declaring fields of Date
         */
        private LocalDate birthday;
        private LocalDate startDate;
        // private LocalDate endDate; for when a doctor leaves the clinic
        private LocalDate startOfTreatment;
        private LocalDate endOfTreatment;
        private int yearsOfExperience;
        private int age;

        /**
         * parametrized constructor for fields
         *
         * @param dateOfBirth
         */
        public Date(LocalDate dateOfBirth, int yearsOfExperience) {
            this.birthday = dateOfBirth;
            this.yearsOfExperience = yearsOfExperience;
            this.age = calculateAge();
        }

        /**
         * setter for birthday
         *
         * @param birthday
         */
        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        /**
         * getter for age in years
         *
         * @return
         */
        public int getAge() {
            return age;
        }

        public String getBirthday() {
            return birthday.toString();
        }

        /**
         * getter for the entire birthday date
         *
         * @return
         */
        public String printBirthday() {
            return String.format("%02d/%02d/%d", birthday.getMonthValue(), birthday.getDayOfMonth(), birthday.getYear());
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public LocalDate getStartOfTreatment() {
            return startOfTreatment;
        }

        public void setStartOfTreatment(LocalDate startOfTreatment) {
            this.startOfTreatment = startOfTreatment;
        }

        public LocalDate getEndOfTreatment() {
            return endOfTreatment;
        }

        public void setEndOfTreatment(LocalDate endOfTreatment) {
            this.endOfTreatment = endOfTreatment;
        }


//
//    /**
//     * method for printing out a person's birthday
//     */
//    // printing out the birthday
//    public void printBirthday() {
//        System.out.printf("\n\tThe entered birth date is: %02d/%02d/%d", birthday.getMonthValue(), birthday.getDayOfMonth(), birthday.getYear());
//    }


        /**
         * method for calculating age, where (age) = (current date) - (dateOfBirth)
         *
         * @return
         */
        private int calculateAge() {
            // tutorial found here
            // https://www.geeksforgeeks.org/how-to-calculate-age-from-a-birthdate-using-java-date-time/

            // get a date of birth from values above
//        LocalDate dateOfBirth = LocalDate.of(this.year, this.month, this.day);

            // get today's date
//        LocalDate currentDate = LocalDate.now();

            // calculating time elapsed between dateOfBirth and today
            Period period = Period.between(LocalDate.now(), this.birthday);
            // removing the negative from the number
            return Math.abs(period.getYears());
        }
//
        private int calculateYearsOfExperience() {
            Period period = Period.between(this.startDate, LocalDate.now());
            return Math.abs(period.getYears());
        }
    }
