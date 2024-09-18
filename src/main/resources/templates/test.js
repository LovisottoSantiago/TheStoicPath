//js for a to-do list

let todoItem = {
    sentenceName: '', // Initialize with an empty string or some default value
    condition: false, // Initialize with a default boolean value

    // Method to create or update a sentence
    createSentence(name, isCompleted) {
        this.sentenceName = name; // Set the sentence name
        this.condition = isCompleted; // Set the condition (e.g., whether it's completed or not)
    },

    // Optional method to display the item
    display() {
        console.log(`Task: ${this.sentenceName}, Completed: ${this.condition}`);
    }
};