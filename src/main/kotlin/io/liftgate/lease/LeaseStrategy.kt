package io.liftgate.lease

/**
 * Defines the sequence of tasks to commence
 * before/after a lease invalidation/request.
 *
 * @author GrowlyX
 * @since 6/26/2022
 */
enum class LeaseStrategy
{
    Expired,
    Compute,
    Eager
}
