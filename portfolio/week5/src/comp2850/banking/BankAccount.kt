// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking



abstract class BankAccount(val holder: String, var initialBalance: Int = 0) {

    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    var balance: Int = initialBalance
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    open fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }

        require(amount <= balance )
        {"Insufficent funds"}

        balance -= amount

    }

}

