# After 15.72 Million Records Were Leaked, Rakuten Securities of Japan Said Something Interesting

——"We have taken urgent measures"

On November 17, Rakuten Securities Japan released an announcement.
The wording was standard, corporate, and very Japanese:
"We detected potential unauthorized access to part of our systems. We immediately blocked the affected areas and have taken urgent measures."

"We have taken urgent measures."

Every time I read this phrase, I wonder: What exactly are these urgent measures? What does "blocking the affected areas" mean?

Details gradually emerged later: An unauthorized party accessed some systems at Rakuten Securities’ Tokyo headquarters. Information from a test environment may have leaked as early as November 11. Rakuten Securities did not spot the anomaly until November 16 and issued the announcement on November 17.

Initially, around 11.25 million accounts were reported to be impacted. One day later, the figure rose to 15.72 million.

15.72 million accounts. The exposed data includes names, residential addresses, annual income, financial assets, and bank account numbers.

In other words, complete financial profiles of 15.72 million Japanese people — how much they earn, how much they have saved, what they invest in, and their bank card numbers — may all have fallen into the hands of an unknown third party.

And then Rakuten Securities stated: We have taken urgent measures.

Here is the question: What "urgent measure" can make 15.72 million already leaked records safe again?

The answer is: No such measure exists.

## Once Data Leaks, It Cannot Be "Recalled"

This is the brutal truth in cybersecurity.

If your money is stolen, it can be recovered. If your belongings are robbed, they can be retrieved. If someone occupies your property, you can reclaim it through legal channels.

But once your data leaks — it is leaked forever.

You cannot make hackers "forget" your bank card number. You cannot force buyers on the dark web to "delete" your ID number. You cannot get everyone who has copied your information to "give it back".

Data is a non-rivalrous good. One person knowing it does not stop others from knowing it. A single dataset can live simultaneously on the hard drives of 100 people, in 1,000 dark web databases, and across 10,000 copied backups. It is impossible to track and destroy every copy.

You can file a police report. Freeze your bank cards. Change your passwords. Notify credit bureaus.

But your ID number will not change. Your name will not change. Your date of birth will not change. You can move house, yet old address records remain in the attacker’s database.

That is why Rakuten Securities’ line about "urgent measures" feels hollow. These steps do not fix the root problem; they are gestures made after the damage is done. Isolating compromised systems, tightening monitoring, notifying affected users, cooperating with police, and offering identity theft protection services are all post-incident remedies. None of them can render leaked data safe again.

There is only one truly effective approach: **make the leaked information useless.**

## What If the Stored Data Is Ciphertext?

Imagine an alternative scenario.
We still have those 15.72 million accounts, and a third party still gains access.

But instead of plaintext, Rakuten Securities stores encrypted ciphertext. What is more, the encryption keys are not kept on Rakuten’s servers — they reside on each user’s own device.

Then what does the attacker obtain?
A string of random characters.
15.72 million sets of random characters.

No readable names, no accessible addresses, no usable bank card numbers, no analyzable annual income. After expending time and resources to breach the system, the attacker ends up with data fragments that hold no commercial, extortion or resale value.

On the dark web, plaintext data carries a price tag: a full set of credit card details can sell for a few to dozens of US dollars, while a complete identity profile may fetch hundreds of dollars.

Ciphertext, by contrast, is worth zero. Without the key, it is indistinguishable from random noise. No one will pay for a pile of unreadable bytes.

This is not speculation. It is the fundamental logic of encrypted storage.

Plaintext storage: a leak equals disaster.
Encrypted storage: a leak yields nothing but noise.

The only difference is whether your data is stored as plaintext or ciphertext while held by the service provider.

## Why Do Most Companies Not Adopt This Approach?

That is a good question.

The answer: encrypted storage creates hassle for businesses.

If data is encrypted, companies cannot run full-text searches. They cannot perform data analytics. They cannot deliver personalized recommendations. They cannot build user profiles. They cannot feed the data into AI models for training. They cannot push targeted products based on user spending habits.

Encryption protects users, yet restricts how businesses monetize and leverage data.

That is why most companies strike a bargain unfavorable to users: store plaintext, and add security safeguards on top.

Firewalls, intrusion detection, access controls, audit logs — these are all security layers built on top of plaintext storage. Their purpose is not to prevent data from being read at all, but to stop unauthorized parties from reading it.

But when an unauthorized party finds a way past firewalls, intrusion detection and access controls — just like what happened to Rakuten Securities — the plaintext is laid bare.

**Businesses choose convenience, while users bear the risk.**

This pattern has repeated many times in 2026 alone. Just looking at November:
A cloud service vendor for TSMC was compromised, and 46,000 employee records were being traded on underground forums. TSMC’s own systems remained intact; the plaintext data entrusted to its supplier was the weak link.

Japan’s government "Government Solution Services" suffered unauthorized access, and internal official documents may have been exposed. This file-sharing platform serves government agencies for inter-department document exchange. The unauthorized access ran from July 30 to November 12 — more than three and a half months before it was discovered.

A vulnerability in Optimizely led to malicious code injection on websites belonging to 178 organizations worldwide, including BBC, CNN, HSBC and Zoom.

A third-party vendor of Infoblox was hacked, exposing customer data.

A third-party platform used by Baker Tilly was breached, leaking client personal information.

Every time, the wording is nearly identical: "We have taken urgent measures."
Every time, the outcome is the same: the data has leaked, and it cannot be retrieved.

## DoraBox Does Not Trust "Urgent Measures"

DoraBox operates on a logic fundamentally different from the "urgent measures" deployed by companies like Rakuten Securities.

It does not assume: "We can stop breaches from happening." It assumes: **Breaches will inevitably happen.**

This assumption is not pessimistic; it is realistic. Security incidents in 2026 have proven that no system is unhackable. It is not that defenders are careless. Attackers only need to find one vulnerability, while defenders must protect every single vulnerability. This game is inherently stacked against the defense.

Built on this premise, DoraBox does one straightforward thing: **your data is encrypted on your local device before it ever leaves your possession.**

It is not encrypted after being uploaded to the cloud. Encryption happens on your device first, and only the resulting ciphertext is stored remotely. The encryption key stays exclusively on your device — never on servers, never in configuration files, never anywhere reachable remotely. The cloud only stores a stream of bytes, indistinguishable from random noise.

What does this mean?

It means even if the cloud server is breached, attackers only get ciphertext.
It means even if an insider from the service provider abuses access rights, all they see is ciphertext.
It means even if the provider is acquired, merged, or changes its privacy policy, your data remains encrypted.
It means even if authorities serve a subpoena demanding the provider hand over your data, the provider can only surrender ciphertext — because they do not hold the key themselves.

**DoraBox shifts the anchor of security from "trying to prevent breaches" to "rendering breaches useless even when they occur."**

This is a fundamental paradigm shift.

From "We will do our best to keep your data safe" to "Your data stays safe even when our protection fails."

The former is a promise, which can be broken. The latter is an architectural design, which holds firm.

## "But I’m just an ordinary person. Who would want to steal my data?"

The 15.72 million account holders at Rakuten Securities probably once thought the same thing.

"I am just an office worker. Why would anyone hack my account?"

The answer: **No one is targeting you specifically. But everyone gets swept up.**

Modern data breaches are not targeted hacks against individuals. They follow a simple pattern: compromise one system, and steal everything inside. The hackers who hit Rakuten Securities were not chasing any single person. They broke into the system, and walked away with the data of 15.72 million people.

You are not the target. You are one data point in a dataset.

Yet when those 15.72 million records are packaged and sold, every single line maps to a real person, a real household, and a real life.

Your bank card number. Your home address. Your annual income. Your investment portfolio.

These details make up your life. To attackers, they are just one row in a spreadsheet.

## Encryption Is Not Mainly "To Stop Hackers" — It Is "For When Things Go Wrong"

DoraBox is not trying to make you unhackable. That is impossible.

Its goal is simple: **If an attack does happen, your losses stay minimal.**

Buying insurance is not hoping for an accident. It is preparing so that if disaster strikes, you will not be ruined.

Your device could be lost. Your passwords could leak. Your cloud provider could get hacked. Data could be intercepted in transit. Your provider could be acquired and rewrite its privacy policy. A rogue insider could betray the company.

You cannot control all these risks.

But you can make sure your data is encrypted before any of these scenarios unfold. No matter which link in the chain fails, anything stolen will be unusable without your key.

**You cannot control the world around you. But you can control whether your data is stored as plaintext.**

## A Practical Example

Open DoraBox and store the documents you value.

Your crypto wallet seed phrases. Backup notes for your hardware security key. Scanned copies of your ID card. Household registration files. Pension account details for your parents. Drafts of your will. Property deeds. Insurance paperwork.

The moment you save them, they get encrypted, and the decryption key stays with you.

Then you can carry on with your life. No constant anxiety, no need to monitor security logs every day, no fear of waking up to news of another hack.

Because in the worst-case scenario — server breach, acquisition, insider misconduct — your data remains nothing but ciphertext.

A pile of ciphertext that cannot be decrypted without its key is the most boring prize an attacker could ever get.

Right now, around 15.72 million people associated with Rakuten Securities are learning this lesson the hard way.

You can make a different choice before it happens to you.

*DoraBox — Don’t wait until your data lands on someone else’s hard drive before you think about encryption.*