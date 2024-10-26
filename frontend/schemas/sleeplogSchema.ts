import { z } from "zod";

export const SleepLogSchema = z.object({
  //<------- Required Fields ------->
  sleep_start: z
    .string({ required_error: "Sleep Start Time is required" })
    .min(1, { message: "Sleep Start Time is required" }),
  wake_time: z
    .string({ required_error: "Wake Time is required" })
    .min(1, { message: "Wake Time is required" })
    .email(),
  quality_rating: z
    .string({ required_error: "Sleep Quality Rating is required" })
    .min(1, { message: "Sleep Quality Rating is required" }),

  //<------- Optional Fields ------->
  notes: z.string().optional(),
});

export type TSleepLog = z.infer<typeof SleepLogSchema>;
