# Wapperende Woensdag - Maart 2023


# Mini Laundry Reservation Kata

## Reservation API
Create an API that:
 
- Takes a reservation date and time, phone number, e-mailaddress and validates the input 
- Locks and selects an available laundry machine from the Machine API
- Saves the reservation 
- Outputs a confirmation message and a reservation number

## Machine API
Create an API that:
 
- Takes a timeslot (date and time)
- Selects an available machine for that timeslot a set of machines
- Locks that machine and saves the new state to the Cosmos DB
- Returns the ID

## Client
Create a console client to test your reservation system.

# Optional
 
 - Use a cosmos db to persist your reservation